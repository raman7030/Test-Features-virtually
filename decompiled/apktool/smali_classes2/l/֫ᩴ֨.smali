.class public final Ll/֫ᩴ֨;
.super Ljava/lang/Object;
.source "07MC"


# static fields
.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public ֫:Ll/۟ۘ֨;

.field public final ۧ:Ll/۟ۘ֨;

.field public final ܽ:Ll/۟ۘ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/֫ᩴ֨;->ᩳ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ll/۫ۘ֨;

    invoke-direct {v0, p0}, Ll/۫ۘ֨;-><init>(Ll/֫ᩴ֨;)V

    iput-object v0, p0, Ll/֫ᩴ֨;->ܽ:Ll/۟ۘ֨;

    .line 89
    new-instance v0, Ll/ۛۘ֨;

    invoke-direct {v0, p0}, Ll/ۛۘ֨;-><init>(Ll/֫ᩴ֨;)V

    iput-object v0, p0, Ll/֫ᩴ֨;->ۧ:Ll/۟ۘ֨;

    .line 109
    new-instance v0, Ll/ۨۘ֨;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    iput-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    .line 124
    sget-object v0, Ll/֫ᩴ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/֫ᩴ֨;
    .locals 1

    .line 58
    sget-object v0, Ll/֫ᩴ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ᩴ֨;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Ll/֫ᩴ֨;

    invoke-direct {v0, p0}, Ll/֫ᩴ֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    if-ne p1, v0, :cond_0

    return-object v0

    .line 130
    :cond_0
    invoke-interface {v0}, Ll/۟ۘ֨;->ۧ()V

    .line 131
    iget-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    .line 132
    iput-object p1, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    .line 133
    invoke-interface {p1}, Ll/۟ۘ֨;->֫()V

    return-object v0
.end method

.method public final ֫(Ll/ܳ֡֨;)V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    invoke-interface {v0, p1}, Ll/۟ۘ֨;->֫(Ll/ܳ֡֨;)V

    return-void
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ۜ֡֨;)V
    .locals 1

    .line 142
    iget-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    invoke-interface {v0, p1, p2}, Ll/۟ۘ֨;->֫(Ll/ܳ֡֨;Ll/ۜ֡֨;)V

    return-void
.end method

.method public final ֫(Ll/᩷֡֨;)V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/֫ᩴ֨;->֫:Ll/۟ۘ֨;

    invoke-interface {v0, p1}, Ll/۟ۘ֨;->֫(Ll/᩷֡֨;)V

    return-void
.end method
