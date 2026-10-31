.class public final synthetic Ll/ᩳ᩷ᩳ;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/᩸ۜ᩵;
.implements Ll/֫۠ܳ;
.implements Ll/֨ۡ֡;


# direct methods
.method public static bridge synthetic ֫(Landroid/system/StructStat;)Landroid/system/StructTimespec;
    .locals 0

    .line 0
    iget-object p0, p0, Landroid/system/StructStat;->st_ctim:Landroid/system/StructTimespec;

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-static {p0}, Ll/۫֨ᩴ;->convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    sget v0, Ll/֫ۢᩳ;->ۗۧ:I

    .line 1253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 227
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
