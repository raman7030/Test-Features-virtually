.class public final Ll/֡۟ܺ;
.super Ljava/lang/Error;
.source "97OM"


# instance fields
.field public final ᩸:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ll/᩵۟ܺ;)V
    .locals 3

    .line 28
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n"

    invoke-static {v1}, Ll/ۜܶܺ;->֫(Ljava/lang/String;)Ll/ۜܶܺ;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ۜܶܺ;->֫(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/֡۟ܺ;->᩸:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܳ۬ܺ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/֡۟ܺ;->᩸:Ll/ܳ۬ܺ;

    return-object v0
.end method
