.class public final synthetic Ll/᩶ᩴᩳ;
.super Ljava/lang/Object;
.source "Q6SD"

# interfaces
.implements Ll/ۡۢ᩻;
.implements Ll/᩷ܿۖ;


# direct methods
.method public static ֫(IILjava/lang/String;)I
    .locals 0

    .line 0
    invoke-static {p2}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, p0

    mul-int p2, p2, p1

    return p2
.end method

.method public static bridge synthetic ֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;
    .locals 0

    .line 0
    iget-object p0, p0, Landroid/system/StructStat;->st_mtim:Landroid/system/StructTimespec;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static synthetic ֫(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-static {p0}, Ll/۫֨ᩴ;->convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 10
    :try_start_0
    invoke-static {}, Ll/ܿܺ᩵;->ۘ()Ll/ܿܺ᩵;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ll/ۧܺ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v0

    .line 33
    check-cast v0, Ll/ۢ֡᩵;

    invoke-virtual {v0, p1}, Ll/ۢ֡᩵;->ۧ(Ljava/lang/String;)[Ll/ۙۡ᩵;

    move-result-object p1

    .line 34
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 35
    aget-object p1, p1, v0

    invoke-interface {p1}, Ll/ۘۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 349
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0
.end method
