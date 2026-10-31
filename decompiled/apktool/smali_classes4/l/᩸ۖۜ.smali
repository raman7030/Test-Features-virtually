.class public final Ll/᩸ۖۜ;
.super Ljava/lang/Object;
.source "D6X3"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public final synthetic ܳ:Ll/۬ۖۜ;

.field public ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/ܶ᩵ܿ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۬ۖۜ;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;)V
    .locals 0

    .line 1762
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۖۜ;->ܳ:Ll/۬ۖۜ;

    .line 1763
    iput-object p2, p0, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    .line 1765
    iput-object p3, p0, Ll/᩸ۖۜ;->ᩳ:Ll/ܶ᩵ܿ;

    return-void
.end method

.method private ֫(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;)J
    .locals 7

    .line 1843
    iget-object v0, p0, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩸ۖۜ;->ܳ:Ll/۬ۖۜ;

    const/high16 v2, 0x10000

    new-array v2, v2, [B

    const-wide/16 v3, 0x0

    .line 1848
    :goto_0
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    if-gez v5, :cond_0

    goto :goto_1

    :cond_0
    if-nez v5, :cond_3

    .line 1863
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-gez v5, :cond_1

    :goto_1
    return-wide v3

    :cond_1
    const/4 v6, 0x1

    .line 1875
    invoke-direct {p0, v6, v3, v4}, Ll/᩸ۖۜ;->֫(IJ)V

    .line 1876
    invoke-virtual {p2, v5}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v5, 0x1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 1867
    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ljava/lang/RuntimeException;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 1868
    throw p1

    .line 1870
    :cond_2
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 1865
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 1879
    :cond_3
    invoke-direct {p0, v5, v3, v4}, Ll/᩸ۖۜ;->֫(IJ)V

    const/4 v6, 0x0

    .line 1880
    invoke-virtual {p2, v2, v6, v5}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v5, v5

    :goto_2
    add-long/2addr v3, v5

    goto :goto_0

    :catch_2
    move-exception p1

    .line 1852
    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ljava/lang/RuntimeException;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 1853
    throw p1

    .line 1855
    :cond_4
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_3
    move-exception p1

    .line 1850
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method private ֫(IJ)V
    .locals 4

    const-wide v0, 0x1fffffffffffffL

    int-to-long v2, p1

    sub-long/2addr v0, v2

    cmp-long p1, p2, v0

    if-gtz p1, :cond_0

    return-void

    .line 1890
    :cond_0
    iget-object p1, p0, Ll/᩸ۖۜ;->ܳ:Ll/۬ۖۜ;

    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p1

    .line 1892
    invoke-virtual {p1}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object p1

    iget-object p1, p1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string p2, "copy_source"

    .line 1893
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p3

    const-string v0, "The local source size exceeds the supported JSON integer range."

    .line 1890
    iget-object v1, p0, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    invoke-static {p3, v0, v1, p1, p2}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ֫(Ll/᩸ۖۜ;)V
    .locals 1

    .line 1907
    iget-boolean v0, p0, Ll/᩸ۖۜ;->ۧ:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Ll/᩸ۖۜ;->᩻:Z

    if-eqz p0, :cond_0

    return-void

    .line 1908
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "The stable source must be copied and validated before the action returns"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/᩸ۖۜ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩸ۖۜ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/OutputStream;)J
    .locals 6

    .line 1772
    iget-object v0, p0, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    iget-object v1, p0, Ll/᩸ۖۜ;->ܳ:Ll/۬ۖۜ;

    .line 1899
    iget-boolean v2, p0, Ll/᩸ۖۜ;->֫:Z

    if-eqz v2, :cond_6

    .line 1774
    iget-boolean v2, p0, Ll/᩸ۖۜ;->ۧ:Z

    if-nez v2, :cond_5

    .line 1780
    :try_start_0
    iget-object v2, p0, Ll/᩸ۖۜ;->ᩳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_8

    .line 1789
    new-instance v3, Ljava/io/BufferedInputStream;

    const/high16 v4, 0x10000

    invoke-direct {v3, v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 1793
    :try_start_1
    invoke-direct {p0, v3, p1}, Ll/᩸ۖۜ;->֫(Ljava/io/BufferedInputStream;Ljava/io/OutputStream;)J

    move-result-wide v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1799
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1816
    iput-wide v4, p0, Ll/᩸ۖۜ;->ܽ:J

    const/4 p1, 0x1

    .line 1817
    iput-boolean p1, p0, Ll/᩸ۖۜ;->ۧ:Z

    const/4 p1, 0x0

    .line 1818
    iput-boolean p1, p0, Ll/᩸ۖۜ;->᩻:Z

    return-wide v4

    :catch_0
    move-exception p1

    .line 1809
    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ljava/lang/RuntimeException;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1810
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 1812
    :cond_0
    throw p1

    :catch_1
    move-exception p1

    .line 1804
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    const/4 v2, 0x0

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_0

    :catch_3
    move-exception p1

    goto :goto_0

    :catch_4
    move-exception p1

    goto :goto_0

    :catch_5
    move-exception p1

    :goto_0
    move-object v2, p1

    .line 1796
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    .line 1799
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_6

    goto :goto_2

    :catch_6
    move-exception v3

    if-nez v2, :cond_2

    .line 1809
    invoke-static {v3}, Ll/۬ۖۜ;->֫(Ljava/lang/RuntimeException;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 1810
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 1812
    :cond_1
    throw v3

    .line 1808
    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_7
    move-exception v3

    if-eqz v2, :cond_3

    .line 1802
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1815
    :goto_2
    throw p1

    .line 1804
    :cond_3
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v3}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_8
    move-exception p1

    .line 1784
    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ljava/lang/RuntimeException;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1785
    throw p1

    .line 1787
    :cond_4
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Ll/ᩳۖۜ;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :catch_9
    move-exception p1

    .line 1782
    invoke-static {v1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 1775
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The stable source can only be copied once"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1900
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The stable source is only valid during its action"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 3

    .line 1899
    iget-boolean v0, p0, Ll/᩸ۖۜ;->֫:Z

    if-eqz v0, :cond_2

    .line 1827
    iget-boolean v0, p0, Ll/᩸ۖۜ;->ۧ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 1831
    iput-boolean v0, p0, Ll/᩸ۖۜ;->᩻:Z

    .line 1833
    iget-wide v0, p0, Ll/᩸ۖۜ;->ܽ:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 1836
    iget-object p1, p0, Ll/᩸ۖۜ;->ܳ:Ll/۬ۖۜ;

    invoke-static {p1}, Ll/۬ۖۜ;->֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object p1

    iget-object p2, p0, Ll/᩸ۖۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 1837
    iput-boolean p1, p0, Ll/᩸ۖۜ;->᩻:Z

    return-void

    .line 1834
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The copied byte count does not match the source result"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1828
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The stable source must be copied before it can be validated"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1900
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The stable source is only valid during its action"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
