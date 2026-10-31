.class public final Ll/ۘۘ۠;
.super Ljava/lang/Object;
.source "I3Z4"


# static fields
.field public static final ᩻:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/ۙᩴ֨;

.field public final ۧ:Ll/᩹ܶ۠;

.field public final ܳ:Ll/ۙۘ۠;

.field public final ܽ:Ll/ۛܶ۠;

.field public final ܿ:Ll/ܽ֡֨;

.field public final ᩳ:Ll/᩺ᩴ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۘۘ۠;->᩻:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    sget-object v0, Ll/ۘۘ۠;->᩻:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 68
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۘ۠;->ۧ:Ll/᩹ܶ۠;

    .line 69
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۘ۠;->ܽ:Ll/ۛܶ۠;

    .line 70
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۘ۠;->ܿ:Ll/ܽ֡֨;

    .line 71
    invoke-static {p1}, Ll/᩺ᩴ֨;->֫(Ll/ۗ֨۠;)Ll/᩺ᩴ֨;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۘ۠;->ᩳ:Ll/᩺ᩴ֨;

    .line 58
    sget-object v0, Ll/ۙۘ۠;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۘ۠;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Ll/ۙۘ۠;

    invoke-direct {v0, p1}, Ll/ۙۘ۠;-><init>(Ll/ۗ֨۠;)V

    .line 72
    :cond_0
    iput-object v0, p0, Ll/ۘۘ۠;->ܳ:Ll/ۙۘ۠;

    .line 73
    invoke-static {p1}, Ll/ۙᩴ֨;->֫(Ll/ۗ֨۠;)Ll/ۙᩴ֨;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۘ۠;->֫:Ll/ۙᩴ֨;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۘۘ۠;
    .locals 1

    .line 52
    sget-object v0, Ll/ۘۘ۠;->᩻:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۘ۠;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Ll/ۘۘ۠;

    invoke-direct {v0, p0}, Ll/ۘۘ۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method
