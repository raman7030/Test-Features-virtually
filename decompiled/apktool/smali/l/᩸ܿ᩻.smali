.class public final synthetic Ll/᩸ܿ᩻;
.super Ljava/lang/Object;
.source "98AW"

# interfaces
.implements Ll/۬ۗܳ;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩹ܿ᩻;

.field public final synthetic ᩹:Ll/ۖۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܿ᩻;Ll/ۖۢܳ;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܿ᩻;->᩸:Ll/᩹ܿ᩻;

    iput-object p2, p0, Ll/᩸ܿ᩻;->᩹:Ll/ۖۢܳ;

    iput p3, p0, Ll/᩸ܿ᩻;->᩶:I

    iput p4, p0, Ll/᩸ܿ᩻;->ۙ:I

    return-void
.end method


# virtual methods
.method public final synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۨۧᩳ;Z)V
    .locals 6

    .line 2
    iget v3, p0, Ll/᩸ܿ᩻;->ۙ:I

    .line 91
    iget-object v0, p0, Ll/᩸ܿ᩻;->᩸:Ll/᩹ܿ᩻;

    iget-object v0, v0, Ll/᩹ܿ᩻;->ۛ:Ll/۫ܿ᩻;

    iget-object v1, p0, Ll/᩸ܿ᩻;->᩹:Ll/ۖۢܳ;

    iget v2, p0, Ll/᩸ܿ᩻;->᩶:I

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Ll/۫ܿ᩻;->֫(Ll/۫ܿ᩻;Ll/ۖۢܳ;IILl/ۨۧᩳ;Z)V

    return-void
.end method

.method public final synthetic ֫(Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
