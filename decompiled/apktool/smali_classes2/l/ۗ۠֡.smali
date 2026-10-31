.class public final Ll/ۗ۠֡;
.super Ljava/lang/Object;
.source "E4JE"


# direct methods
.method public static ֫(Ll/ۗ᩵ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x22

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 46
    invoke-static {p0, p1}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x4

    const-string v2, "null"

    .line 116
    invoke-virtual {p0, v2, v1, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    :goto_0
    const/16 p1, 0x3a

    .line 63
    invoke-virtual {p0, p1}, Ll/ۗ᩵ۚ;->write(I)V

    if-eqz p2, :cond_1

    .line 116
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p2, v1, p1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    goto :goto_1

    :cond_1
    const-string p1, "V"

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v1, p2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    :goto_1
    if-eqz p3, :cond_2

    const-string p1, ", "

    const/4 p2, 0x2

    invoke-virtual {p0, p1, v1, p2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 45
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 46
    invoke-static {p0, p3}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    :cond_2
    return-void
.end method
