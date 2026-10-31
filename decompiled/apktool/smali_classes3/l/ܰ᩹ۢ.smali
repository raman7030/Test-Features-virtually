.class public final Ll/ܰ᩹ۢ;
.super Landroid/os/Handler;
.source "M1TZ"


# instance fields
.field public final ֫:[B

.field public final synthetic ۧ:Ll/ܿ᩶ۢ;


# direct methods
.method public constructor <init>(Ll/ܿ᩶ۢ;Landroid/os/Looper;)V
    .locals 0

    .line 181
    iput-object p1, p0, Ll/ܰ᩹ۢ;->ۧ:Ll/ܿ᩶ۢ;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/16 p1, 0x1000

    new-array p1, p1, [B

    .line 182
    iput-object p1, p0, Ll/ܰ᩹ۢ;->֫:[B

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 186
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܰ᩹ۢ;->ۧ:Ll/ܿ᩶ۢ;

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    invoke-virtual {v2}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    invoke-static {v2}, Ll/ܿ᩶ۢ;->ᩳ(Ll/ܿ᩶ۢ;)Ll/ۨܶۢ;

    move-result-object p1

    iget-object v0, p0, Ll/ܰ᩹ۢ;->֫:[B

    invoke-virtual {p1, v0, v1}, Ll/ۨܶۢ;->֫([BZ)I

    move-result p1

    if-lez p1, :cond_3

    .line 189
    invoke-static {v2}, Ll/ܿ᩶ۢ;->ۧ(Ll/ܿ᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ll/ܿ᩹ۢ;->֫(I[B)V

    .line 190
    invoke-static {v2}, Ll/ܿ᩶ۢ;->᩷(Ll/ܿ᩶ۢ;)V

    return-void

    .line 192
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v4, 0x4

    if-ne v0, v4, :cond_3

    .line 193
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 194
    invoke-static {v2}, Ll/ܿ᩶ۢ;->ۜ(Ll/ܿ᩶ۢ;)V

    .line 195
    invoke-static {v2}, Ll/ܿ᩶ۢ;->֫(Ll/ܿ᩶ۢ;)Ll/ܽ᩶ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, ") "

    if-lez p1, :cond_1

    const-string v4, "(error "

    .line 0
    invoke-static {p1, v4, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-gez p1, :cond_2

    .line 387
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "(signal "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    neg-int p1, p1

    .line 0
    invoke-static {p1, v0, v4}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string p1, ""

    :goto_0
    new-array v0, v3, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const p1, 0x7f120a47

    .line 391
    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\r\n"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 198
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 199
    invoke-static {v2}, Ll/ܿ᩶ۢ;->ۧ(Ll/ܿ᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v0

    array-length v1, p1

    invoke-virtual {v0, v1, p1}, Ll/ܿ᩹ۢ;->֫(I[B)V

    .line 200
    invoke-static {v2}, Ll/ܿ᩶ۢ;->᩷(Ll/ܿ᩶ۢ;)V

    :cond_3
    return-void
.end method
