.class public Ll/᩸ۖ֫;
.super Ljava/lang/Object;
.source "Z22N"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۫᩺ۧ;)Ll/ܶۖ֫;
    .locals 3

    .line 11
    new-instance v0, Ll/ܶۖ֫;

    invoke-direct {v0}, Ll/ܶۖ֫;-><init>()V

    .line 12
    iget v1, v0, Ll/ܶۖ֫;->ᩳ:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ܶۖ֫;->ᩳ:I

    .line 13
    iget v1, v0, Ll/ܶۖ֫;->֫:I

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ܶۖ֫;->֫:I

    .line 14
    iget v1, v0, Ll/ܶۖ֫;->ۧ:I

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ܶۖ֫;->ۧ:I

    .line 15
    iget v1, v0, Ll/ܶۖ֫;->ܽ:I

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result p0

    iput p0, v0, Ll/ܶۖ֫;->ܽ:I

    return-object v0
.end method

.method public static ֫(Ll/ܶۖ֫;Ll/۫᩺ۧ;)V
    .locals 2

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iget v0, p0, Ll/ܶۖ֫;->ᩳ:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 23
    iget v0, p0, Ll/ܶۖ֫;->֫:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 24
    iget v0, p0, Ll/ܶۖ֫;->ۧ:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 25
    iget p0, p0, Ll/ܶۖ֫;->ܽ:I

    const/4 v0, 0x4

    invoke-virtual {p1, p0, v0}, Ll/۫᩺ۧ;->ۧ(II)V

    return-void
.end method
