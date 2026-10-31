.class public final synthetic Ll/ۢܳ᩻;
.super Ljava/lang/Object;
.source "OAHZ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Lbin/mt/plus/Main;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۤ:Ll/۬ۗܿ;

.field public final synthetic ۫:Ll/ۖۢܳ;

.field public final synthetic ۬:Ll/ۗۢ᩻;

.field public final synthetic ᩶:Ll/ᩳۜܳ;

.field public final synthetic ᩸:[Landroid/widget/RadioButton;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;ILl/ᩳۜܳ;Ljava/lang/String;Lbin/mt/plus/Main;Ll/ۗۢ᩻;Ll/ۖۢܳ;Ll/۬ۗܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܳ᩻;->᩸:[Landroid/widget/RadioButton;

    iput p2, p0, Ll/ۢܳ᩻;->᩹:I

    iput-object p3, p0, Ll/ۢܳ᩻;->᩶:Ll/ᩳۜܳ;

    iput-object p4, p0, Ll/ۢܳ᩻;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۢܳ᩻;->ۗ:Lbin/mt/plus/Main;

    iput-object p6, p0, Ll/ۢܳ᩻;->۬:Ll/ۗۢ᩻;

    iput-object p7, p0, Ll/ۢܳ᩻;->۫:Ll/ۖۢܳ;

    iput-object p8, p0, Ll/ۢܳ᩻;->ۤ:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x3

    if-ge p1, p2, :cond_1

    .line 249
    iget-object p2, p0, Ll/ۢܳ᩻;->᩸:[Landroid/widget/RadioButton;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p2

    if-eqz p2, :cond_0

    move v2, p1

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    const/4 v2, 0x0

    .line 254
    :goto_1
    iget p1, p0, Ll/ۢܳ᩻;->᩹:I

    if-eq p1, v2, :cond_2

    .line 255
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string p2, "rcon"

    int-to-byte v0, v2

    invoke-interface {p1, v0, p2}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 257
    :cond_2
    iget-object p1, p0, Ll/ۢܳ᩻;->᩶:Ll/ᩳۜܳ;

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v6

    .line 258
    invoke-interface {p1}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v3

    .line 259
    iget-object v8, p0, Ll/ۢܳ᩻;->ۙ:Ljava/lang/String;

    invoke-static {v3, v8}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 261
    new-instance p1, Ll/ۘܳ᩻;

    iget-object v1, p0, Ll/ۢܳ᩻;->ۗ:Lbin/mt/plus/Main;

    iget-object v4, p0, Ll/ۢܳ᩻;->۬:Ll/ۗۢ᩻;

    iget-object v7, p0, Ll/ۢܳ᩻;->۫:Ll/ۖۢܳ;

    iget-object v9, p0, Ll/ۢܳ᩻;->ۤ:Ll/۬ۗܿ;

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Ll/ۘܳ᩻;-><init>(Lbin/mt/plus/Main;ILjava/lang/String;Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;Ll/ۖۢܳ;Ljava/lang/String;Ll/۬ۗܿ;)V

    .line 337
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
