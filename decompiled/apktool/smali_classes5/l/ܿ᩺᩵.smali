.class public final synthetic Ll/ܿ᩺᩵;
.super Ljava/lang/Object;
.source "QB6R"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;
.implements Ll/᩷ܿۖ;
.implements Ll/֡ۨۡ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿ᩺᩵;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;I)V
    .locals 0

    const/4 p1, 0x3

    .line 0
    iput p1, p0, Ll/ܿ᩺᩵;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ᩴ᩵֫;)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/ܿ᩺᩵;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/lang/Class;
    .locals 1

    .line 0
    const-class v0, Landroid/content/pm/ShortcutManager;

    return-object v0
.end method

.method public static synthetic ֫(J)Ljava/lang/String;
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    const-string p0, "0"

    return-object p0

    :cond_0
    const/16 v3, 0x10

    if-lez v2, :cond_1

    .line 0
    invoke-static {p0, p1, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v2, 0x40

    new-array v4, v2, [C

    invoke-static {v3}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v5

    :cond_2
    add-int/lit8 v2, v2, -0x1

    long-to-int v6, p0

    and-int/lit8 v6, v6, 0xf

    invoke-static {v6, v3}, Ljava/lang/Character;->forDigit(II)C

    move-result v6

    aput-char v6, v4, v2

    ushr-long/2addr p0, v5

    cmp-long v6, p0, v0

    if-nez v6, :cond_2

    new-instance p0, Ljava/lang/String;

    rsub-int/lit8 p1, v2, 0x40

    invoke-direct {p0, v4, v2, p1}, Ljava/lang/String;-><init>([CII)V

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/ۢۧۧ;

    .line 178
    invoke-interface {p1}, Ll/ۢۧۧ;->᩻()Ll/ۛܽۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛܽۧ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ܿ᩺᩵;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 541
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 560
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 0
    new-instance v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public ۧ()Ljava/lang/Object;
    .locals 1

    .line 391
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    return-object v0
.end method
