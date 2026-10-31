.class public abstract Ll/᩺۟ܺ;
.super Ljava/lang/Object;
.source "A7QO"


# static fields
.field public static final ֫:Ll/᩺۟ܺ;

.field public static final ۧ:Ll/᩺۟ܺ;

.field public static final ܽ:Ll/᩺۟ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 91
    new-instance v0, Ll/ۨ۟ܺ;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨ۟ܺ;-><init>(Ll/ܽ۫ᩴ;)V

    sput-object v0, Ll/᩺۟ܺ;->ܽ:Ll/᩺۟ܺ;

    .line 96
    new-instance v0, Ll/ۨ۟ܺ;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨ۟ܺ;-><init>(Ll/ܽ۫ᩴ;)V

    sput-object v0, Ll/᩺۟ܺ;->֫:Ll/᩺۟ܺ;

    .line 102
    new-instance v0, Ll/ۨ۟ܺ;

    .line 103
    invoke-static {}, Ll/ܽ۫ᩴ;->empty()Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۨ۟ܺ;-><init>(Ll/ܽ۫ᩴ;)V

    sput-object v0, Ll/᩺۟ܺ;->ۧ:Ll/᩺۟ܺ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/۟۟ܺ;)Ll/᩺۟ܺ;
    .locals 1

    .line 119
    new-instance v0, Ll/ۛ۟ܺ;

    invoke-static {p0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۛ۟ܺ;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫()Ll/ܽ۫ᩴ;
.end method

.method public abstract ֫(Ll/᩺۟ܺ;)Ll/᩺۟ܺ;
.end method
