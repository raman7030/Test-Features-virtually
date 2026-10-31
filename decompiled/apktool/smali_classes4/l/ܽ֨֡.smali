.class public final Ll/ܽ֨֡;
.super Ljava/lang/Object;
.source "87S9"


# instance fields
.field public final ֫:Ljava/lang/CharSequence;

.field public final ۧ:Ll/᩶ۚ֡;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "content must not be null"

    .line 21
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/CharSequence;

    iput-object p1, p0, Ll/ܽ֨֡;->֫:Ljava/lang/CharSequence;

    .line 22
    iput-object p2, p0, Ll/ܽ֨֡;->ۧ:Ll/᩶ۚ֡;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;
    .locals 1

    .line 17
    new-instance v0, Ll/ܽ֨֡;

    invoke-direct {v0, p0, p1}, Ll/ܽ֨֡;-><init>(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ܽ֨֡;->֫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ֫(II)Ll/ܽ֨֡;
    .locals 4

    .line 34
    iget-object v0, p0, Ll/ܽ֨֡;->֫:Ljava/lang/CharSequence;

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 36
    iget-object v1, p0, Ll/ܽ֨֡;->ۧ:Ll/᩶ۚ֡;

    if-eqz v1, :cond_0

    sub-int/2addr p2, p1

    if-eqz p2, :cond_0

    .line 39
    invoke-virtual {v1}, Ll/᩶ۚ֡;->֫()I

    move-result v2

    add-int/2addr v2, p1

    .line 40
    invoke-virtual {v1}, Ll/᩶ۚ֡;->ۧ()I

    move-result v3

    add-int/2addr v3, p1

    .line 42
    invoke-virtual {v1}, Ll/᩶ۚ֡;->ᩳ()I

    move-result p1

    invoke-static {p1, v2, v3, p2}, Ll/᩶ۚ֡;->֫(IIII)Ll/᩶ۚ֡;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    new-instance p2, Ll/ܽ֨֡;

    invoke-direct {p2, v0, p1}, Ll/ܽ֨֡;-><init>(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)V

    return-object p2
.end method

.method public final ۧ()Ll/᩶ۚ֡;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܽ֨֡;->ۧ:Ll/᩶ۚ֡;

    return-object v0
.end method
