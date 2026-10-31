.class public final Ll/۠ܿܳ;
.super Ll/ۡ֨֡;
.source "56MU"


# instance fields
.field public final ֫:Ll/᩹ܿܳ;

.field public ۧ:Z

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput-boolean p3, p0, Ll/۠ܿܳ;->ܿ:Z

    iput-object p1, p0, Ll/۠ܿܳ;->ܽ:Ljava/lang/String;

    iput-object p2, p0, Ll/۠ܿܳ;->ᩳ:Ljava/lang/String;

    .line 218
    new-instance p1, Ll/᩹ܿܳ;

    invoke-direct {p1}, Ll/᩹ܿܳ;-><init>()V

    iput-object p1, p0, Ll/۠ܿܳ;->֫:Ll/᩹ܿܳ;

    const/4 p1, 0x1

    .line 219
    iput-boolean p1, p0, Ll/۠ܿܳ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 2

    .line 222
    iget-boolean v0, p0, Ll/۠ܿܳ;->ܿ:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 223
    :cond_0
    invoke-interface {p1}, Ll/᩵֨֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 224
    iget-object v1, p0, Ll/۠ܿܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23
    new-instance p1, Ll/ܳ᩵֡;

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p1, v0, v0, v1}, Ll/ܳ᩵֡;-><init>(IIZ)V

    return-object p1

    .line 224
    :cond_1
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 3

    .line 227
    iget-boolean v0, p0, Ll/۠ܿܳ;->ۧ:Z

    iget-object v1, p0, Ll/۠ܿܳ;->֫:Ll/᩹ܿܳ;

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    .line 228
    iput-boolean p1, p0, Ll/۠ܿܳ;->ۧ:Z

    .line 229
    iget-boolean p1, p0, Ll/۠ܿܳ;->ܿ:Z

    if-eqz p1, :cond_0

    iget-object p1, v1, Ll/᩹ܿܳ;->᩻:Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/۠ܿܳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    sub-int/2addr v1, v2

    invoke-virtual {p1, v0, v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_0
    return-void

    .line 230
    :cond_1
    iget-object v0, v1, Ll/᩹ܿܳ;->᩻:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 220
    iget-object v0, p0, Ll/۠ܿܳ;->֫:Ll/᩹ܿܳ;

    return-object v0
.end method
