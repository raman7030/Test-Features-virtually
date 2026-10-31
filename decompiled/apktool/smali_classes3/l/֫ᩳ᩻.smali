.class public final Ll/֫ᩳ᩻;
.super Ljava/lang/Object;
.source "J951"

# interfaces
.implements Ll/֨᩸ܿ;


# instance fields
.field public final synthetic ᩶:Ll/᩵ۛۡ;

.field public final synthetic ᩸:Ll/ۧᩳ᩻;

.field public final synthetic ᩹:Ll/᩵ۛۡ;


# direct methods
.method public constructor <init>(Ll/ۧᩳ᩻;Ll/᩵ۛۡ;Ll/᩵ۛۡ;)V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩳ᩻;->᩸:Ll/ۧᩳ᩻;

    iput-object p2, p0, Ll/֫ᩳ᩻;->᩹:Ll/᩵ۛۡ;

    iput-object p3, p0, Ll/֫ᩳ᩻;->᩶:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJ)V
    .locals 0

    .line 209
    iget-object p3, p0, Ll/֫ᩳ᩻;->᩹:Ll/᩵ۛۡ;

    invoke-virtual {p3, p1, p2}, Ll/᩵ۛۡ;->֫(J)V

    .line 210
    iget-object p3, p0, Ll/֫ᩳ᩻;->᩶:Ll/᩵ۛۡ;

    invoke-virtual {p3, p1, p2}, Ll/᩵ۛۡ;->֫(J)V

    return-void
.end method

.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 215
    iget-object v0, p0, Ll/֫ᩳ᩻;->᩸:Ll/ۧᩳ᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
