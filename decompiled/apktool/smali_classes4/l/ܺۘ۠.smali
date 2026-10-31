.class public final Ll/ܺۘ۠;
.super Ljava/lang/Object;
.source "D3ZV"


# static fields
.field public static final ۜ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/ܿ֨۠;

.field public final ۧ:Ll/᩹ܶ۠;

.field public final ܳ:Ll/ۘۘ۠;

.field public final ܽ:Ll/ۛܶ۠;

.field public final ܿ:Ll/᩺ᩴ֨;

.field public final ᩳ:Ll/ۨܶ۠;

.field public final ᩻:Ll/ܽ֡֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ܺۘ۠;->ۜ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    sget-object v0, Ll/ܺۘ۠;->ۜ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 75
    invoke-static {p1}, Ll/ܿ֨۠;->֫(Ll/ۗ֨۠;)Ll/ܿ֨۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->֫:Ll/ܿ֨۠;

    .line 76
    invoke-static {p1}, Ll/۟ᩴ۠;->֫(Ll/ۗ֨۠;)V

    .line 77
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->ۧ:Ll/᩹ܶ۠;

    .line 78
    invoke-static {p1}, Ll/ۛܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۛܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->ܽ:Ll/ۛܶ۠;

    .line 58
    sget-object v0, Ll/ۙۘ۠;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۘ۠;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Ll/ۙۘ۠;

    invoke-direct {v0, p1}, Ll/ۙۘ۠;-><init>(Ll/ۗ֨۠;)V

    .line 80
    :cond_0
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->᩻:Ll/ܽ֡֨;

    .line 81
    invoke-static {p1}, Ll/᩺ᩴ֨;->֫(Ll/ۗ֨۠;)Ll/᩺ᩴ֨;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->ܿ:Ll/᩺ᩴ֨;

    .line 82
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->ᩳ:Ll/ۨܶ۠;

    .line 83
    invoke-static {p1}, Ll/ۘۘ۠;->֫(Ll/ۗ֨۠;)Ll/ۘۘ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۘ۠;->ܳ:Ll/ۘۘ۠;

    .line 84
    const-class v0, Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Locale;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ܺۘ۠;
    .locals 1

    .line 54
    sget-object v0, Ll/ܺۘ۠;->ۜ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۘ۠;

    if-nez v0, :cond_0

    .line 56
    new-instance v0, Ll/ܺۘ۠;

    invoke-direct {v0, p0}, Ll/ܺۘ۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;ZZZZ)Ll/ܳۘ۠;
    .locals 9

    .line 92
    iget-object v0, p0, Ll/ܺۘ۠;->ܳ:Ll/ۘۘ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    instance-of v1, p1, Ljava/nio/CharBuffer;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/nio/CharBuffer;

    if-eqz p2, :cond_0

    .line 79
    new-instance v1, Ll/ۖۘ۠;

    new-instance v2, Ll/᩷ۘ۠;

    invoke-direct {v2, v0, p1}, Ll/᩷ۘ۠;-><init>(Ll/ۘۘ۠;Ljava/nio/CharBuffer;)V

    invoke-direct {v1, v0, v2}, Ll/ۖۘ۠;-><init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V

    goto :goto_1

    .line 81
    :cond_0
    new-instance v1, Ll/ۖۘ۠;

    .line 74
    new-instance v2, Ll/ۙۖ۠;

    invoke-direct {v2, v0, p1}, Ll/ۙۖ۠;-><init>(Ll/ۘۘ۠;Ljava/nio/CharBuffer;)V

    invoke-direct {v1, v0, v2}, Ll/ۖۘ۠;-><init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V

    goto :goto_1

    .line 83
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    .line 84
    array-length v1, p1

    if-eqz p2, :cond_2

    .line 90
    new-instance v2, Ll/ۖۘ۠;

    new-instance v3, Ll/᩷ۘ۠;

    invoke-direct {v3, v0, p1, v1}, Ll/᩷ۘ۠;-><init>(Ll/ۘۘ۠;[CI)V

    invoke-direct {v2, v0, v3}, Ll/ۖۘ۠;-><init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V

    goto :goto_0

    .line 92
    :cond_2
    new-instance v2, Ll/ۖۘ۠;

    .line 78
    new-instance v3, Ll/ۙۖ۠;

    invoke-direct {v3, v0, p1, v1}, Ll/ۙۖ۠;-><init>(Ll/ۘۘ۠;[CI)V

    invoke-direct {v2, v0, v3}, Ll/ۖۘ۠;-><init>(Ll/ۘۘ۠;Ll/ۙۖ۠;)V

    :goto_0
    move-object v1, v2

    :goto_1
    move-object v4, v1

    .line 93
    new-instance p1, Ll/ܳۘ۠;

    move-object v2, p1

    move-object v3, p0

    move v5, p2

    move v6, p4

    move v7, p3

    move v8, p5

    invoke-direct/range {v2 .. v8}, Ll/ܳۘ۠;-><init>(Ll/ܺۘ۠;Ll/ۖۘ۠;ZZZZ)V

    return-object p1
.end method
