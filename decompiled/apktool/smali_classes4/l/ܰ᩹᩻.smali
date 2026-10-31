.class public final synthetic Ll/ܰ᩹᩻;
.super Ljava/lang/Object;
.source "J1YX"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ۙ:Ll/ᩳ᩶᩻;

.field public final synthetic ᩶:Ll/ܶ᩵ܿ;

.field public final synthetic ᩸:Ll/۟᩹᩻;

.field public final synthetic ᩹:Ll/ۖۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۟᩹᩻;Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ll/ᩳ᩶᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩹᩻;->᩸:Ll/۟᩹᩻;

    iput-object p2, p0, Ll/ܰ᩹᩻;->᩹:Ll/ۖۢܳ;

    iput-object p3, p0, Ll/ܰ᩹᩻;->᩶:Ll/ܶ᩵ܿ;

    iput-object p4, p0, Ll/ܰ᩹᩻;->ۙ:Ll/ᩳ᩶᩻;

    return-void
.end method


# virtual methods
.method public final synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 7

    .line 155
    iget-object v0, p0, Ll/ܰ᩹᩻;->᩸:Ll/۟᩹᩻;

    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    .line 156
    iget-object v0, p0, Ll/ܰ᩹᩻;->ۙ:Ll/ᩳ᩶᩻;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-object v1, p0, Ll/ܰ᩹᩻;->᩹:Ll/ۖۢܳ;

    iget-object v2, p0, Ll/ܰ᩹᩻;->᩶:Ll/ܶ᩵ܿ;

    const-string v3, ""

    move-object v5, p1

    move v6, p2

    invoke-static/range {v1 .. v6}, Ll/᩻᩶᩻;->֫(Ll/ۖۢܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/util/List;Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
