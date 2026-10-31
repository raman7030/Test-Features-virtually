.class public final Ll/ۗ᩺;
.super Ljava/lang/Object;
.source "R9NW"


# static fields
.field public static ۡ᩺֡:I


# instance fields
.field public final ֫:Ll/ۧ۬;

.field public final ۧ:Ll/ۧ۬;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation$Bounds;)V
    .locals 1

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 229
    invoke-static {p1}, Ll/ܽܰ;->ۧ(Landroid/view/WindowInsetsAnimation$Bounds;)Ll/ۧ۬;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ᩺;->֫:Ll/ۧ۬;

    .line 230
    invoke-static {p1}, Ll/ܽܰ;->֫(Landroid/view/WindowInsetsAnimation$Bounds;)Ll/ۧ۬;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩺;->ۧ:Ll/ۧ۬;

    return-void
.end method

.method public constructor <init>(Ll/ۧ۬;Ll/ۧ۬;)V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    iput-object p1, p0, Ll/ۗ᩺;->֫:Ll/ۧ۬;

    .line 224
    iput-object p2, p0, Ll/ۗ᩺;->ۧ:Ll/ۧ۬;

    return-void
.end method

.method public static ֡۟۬(Ljava/lang/Object;I)Landroid/view/View;
    .locals 0

    check-cast p0, Ll/ۗܺ᩷;

    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/WindowInsetsAnimation$Bounds;)Ll/ۗ᩺;
    .locals 1

    .line 324
    new-instance v0, Ll/ۗ᩺;

    invoke-direct {v0, p0}, Ll/ۗ᩺;-><init>(Landroid/view/WindowInsetsAnimation$Bounds;)V

    return-object v0
.end method

.method public static ۜܶۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۠ᩴۛ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ۡۖᩳ;->ᩳ(Landroid/text/SpannableStringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public static ۡܰ۬(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۟ܶۡ;

    check-cast p1, Ll/ۗܺ᩷;

    invoke-virtual {p0, p1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public static ۢ֫ۡ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/᩶ۘܽ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۢ۠ᩴ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܿ۠ۢ;

    invoke-virtual {p0}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p0

    return p0
.end method

.method public static ۤ֨ۗ()I
    .locals 1

    const v0, 0x7ccbf7a3

    return v0
.end method

.method public static ۧ۫֫(Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 0

    check-cast p0, Ll/ۡ᩻֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static ۫ᩳ᩵([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ܶۜ᩻(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ܺۙ᩶(Ljava/lang/Object;)Ll/ܶۖ᩷;
    .locals 0

    check-cast p0, Ll/᩹ۖ᩷;

    invoke-static {p0}, Ll/᩹ۖ᩷;->ܿ(Ll/᩹ۖ᩷;)Ll/ܶۖ᩷;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳۗۚ()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ᩴۛۤ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/io/OutputStream;

    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public static ᩷ۘۚ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/֫ۧۚ;

    invoke-interface {p0}, Ll/֫ۧۚ;->֫()I

    move-result p0

    return p0
.end method

.method public static ᩸ۛۧ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ᩸۬۬(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗ᩺;->֫:Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗ᩺;->ۧ:Ll/ۧ۬;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۧ۬;
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ۗ᩺;->֫:Ll/ۧ۬;

    return-object v0
.end method

.method public final ۧ()Ll/ۧ۬;
    .locals 1

    .line 278
    iget-object v0, p0, Ll/ۗ᩺;->ۧ:Ll/ۧ۬;

    return-object v0
.end method
