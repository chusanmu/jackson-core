package com.fasterxml.jackson.core;

/**
 * TODO: 由特定于数据格式的特征来实现的,
 * Marker interface that is to be implemented by data format - specific features.
 * Interface used since Java Enums can not extend classes or other Enums, but
 * they can implement interfaces; and as such we may be able to use limited
 * amount of generic functionality.
 *<p>
 * Note that this type is only implemented by non-JSON formats:
 * types {@link JsonParser.Feature} and {@link JsonGenerator.Feature} do NOT
 * implement it. This is to make it easier to avoid ambiguity with method
 * calls.
 * 
 * @since 2.6 (to be fully used in 2.7 and beyond)
 */
public interface FormatFeature
{
    /**
     * 默认是开启的
     * Accessor for checking whether this feature is enabled by default.
     */
    public boolean enabledByDefault();
    
    /**
     * 返回该特性的掩码，必须是个single bit 形如 1 << N
     * Returns bit mask for this feature instance; must be a single bit,
     * that is of form <code>(1 &lt;&lt; N)</code>
     */
    public int getMask();

    /**
     * 在给定的掩码上，该特征是否启用了
     * Convenience method for checking whether feature is enabled in given bitmask
     */
    public boolean enabledIn(int flags);
}
