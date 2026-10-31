.class public final synthetic Ll/᩸᩺ܽ;
.super Ljava/lang/Object;
.source "Y184"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/۬᩺ܽ;

.field public final synthetic ۙ:Ll/۬᩺ܽ;

.field public final synthetic ᩶:Ll/۬᩺ܽ;

.field public final synthetic ᩸:Ll/ۛ᩺ܽ;

.field public final synthetic ᩹:Ll/۬᩺ܽ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ܽ;->᩸:Ll/ۛ᩺ܽ;

    iput-object p2, p0, Ll/᩸᩺ܽ;->᩹:Ll/۬᩺ܽ;

    iput-object p3, p0, Ll/᩸᩺ܽ;->᩶:Ll/۬᩺ܽ;

    iput-object p4, p0, Ll/᩸᩺ܽ;->ۙ:Ll/۬᩺ܽ;

    iput-object p5, p0, Ll/᩸᩺ܽ;->ۗ:Ll/۬᩺ܽ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 2
    sget p1, Ll/ۛ᩺ܽ;->᩷ۧ:I

    .line 371
    new-instance p1, Ll/᩶᩺ܽ;

    iget-object v1, p0, Ll/᩸᩺ܽ;->᩸:Ll/ۛ᩺ܽ;

    iget-object v2, p0, Ll/᩸᩺ܽ;->᩹:Ll/۬᩺ܽ;

    iget-object v3, p0, Ll/᩸᩺ܽ;->᩶:Ll/۬᩺ܽ;

    iget-object v4, p0, Ll/᩸᩺ܽ;->ۙ:Ll/۬᩺ܽ;

    iget-object v5, p0, Ll/᩸᩺ܽ;->ۗ:Ll/۬᩺ܽ;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/᩶᩺ܽ;-><init>(Ll/ۗܺ᩷;Ll/۬᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;)V

    const v0, 0x7f1205e1

    .line 393
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    const-string v0, "Smali"

    .line 394
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ܿ(Ljava/lang/String;)V

    const-string v0, "Lxxx;->method()V"

    .line 395
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 396
    invoke-virtual {p1}, Ll/۬ۗܿ;->ܺ()V

    .line 397
    invoke-static {}, Ll/ۙ᩸᩷;->ܳ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "->"

    .line 500
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 501
    array-length v3, v2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 504
    aget-object v5, v2, v3

    .line 505
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v4, :cond_8

    const-string v6, "L"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    const-string v6, ";"

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 508
    :cond_2
    aget-object v2, v2, v1

    const-string v5, "\\("

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 509
    array-length v5, v2

    if-eq v5, v4, :cond_3

    goto :goto_0

    .line 512
    :cond_3
    aget-object v5, v2, v3

    .line 513
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_0

    .line 516
    :cond_4
    aget-object v2, v2, v1

    const-string v5, "\\)"

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 517
    array-length v5, v2

    if-eq v5, v4, :cond_5

    goto :goto_0

    .line 520
    :cond_5
    aget-object v3, v2, v3

    .line 521
    aget-object v2, v2, v1

    const-string v4, "(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*"

    .line 522
    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const-string v3, "\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)"

    .line 525
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    .line 400
    :cond_7
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Ll/۬ۗܿ;->᩵()V

    .line 205
    :cond_8
    :goto_0
    invoke-virtual {p1, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method
