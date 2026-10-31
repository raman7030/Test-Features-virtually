.class public final synthetic Ll/۬ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۗ:Ll/ۖۙᩳ;

.field public final synthetic ۙ:Ll/᩻ۙᩳ;

.field public final synthetic ۤ:Ll/᩻ۙᩳ;

.field public final synthetic ۫:[Ll/ۚۗᩳ;

.field public final synthetic ۬:[Ll/ۖۙᩳ;

.field public final synthetic ᩶:[J

.field public final synthetic ᩸:Ll/᩻۬ᩳ;

.field public final synthetic ᩹:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ll/᩻۬ᩳ;Ljava/util/function/Consumer;[JLl/᩻ۙᩳ;Ll/ۖۙᩳ;[Ll/ۖۙᩳ;[Ll/ۚۗᩳ;Ll/᩻ۙᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۗᩳ;->᩸:Ll/᩻۬ᩳ;

    iput-object p2, p0, Ll/۬ۗᩳ;->᩹:Ljava/util/function/Consumer;

    iput-object p3, p0, Ll/۬ۗᩳ;->᩶:[J

    iput-object p4, p0, Ll/۬ۗᩳ;->ۙ:Ll/᩻ۙᩳ;

    iput-object p5, p0, Ll/۬ۗᩳ;->ۗ:Ll/ۖۙᩳ;

    iput-object p6, p0, Ll/۬ۗᩳ;->۬:[Ll/ۖۙᩳ;

    iput-object p7, p0, Ll/۬ۗᩳ;->۫:[Ll/ۚۗᩳ;

    iput-object p8, p0, Ll/۬ۗᩳ;->ۤ:Ll/᩻ۙᩳ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 9

    .line 0
    iget-object v7, p0, Ll/۬ۗᩳ;->ۤ:Ll/᩻ۙᩳ;

    move-object v8, p1

    check-cast v8, Ll/ܺ᩹ᩳ;

    iget-object v0, p0, Ll/۬ۗᩳ;->᩸:Ll/᩻۬ᩳ;

    iget-object v1, p0, Ll/۬ۗᩳ;->᩹:Ljava/util/function/Consumer;

    iget-object v2, p0, Ll/۬ۗᩳ;->᩶:[J

    iget-object v3, p0, Ll/۬ۗᩳ;->ۙ:Ll/᩻ۙᩳ;

    iget-object v4, p0, Ll/۬ۗᩳ;->ۗ:Ll/ۖۙᩳ;

    iget-object v5, p0, Ll/۬ۗᩳ;->۬:[Ll/ۖۙᩳ;

    iget-object v6, p0, Ll/۬ۗᩳ;->۫:[Ll/ۚۗᩳ;

    invoke-static/range {v0 .. v8}, Ll/᩻۬ᩳ;->֫(Ll/᩻۬ᩳ;Ljava/util/function/Consumer;[JLl/᩻ۙᩳ;Ll/ۖۙᩳ;[Ll/ۖۙᩳ;[Ll/ۚۗᩳ;Ll/᩻ۙᩳ;Ll/ܺ᩹ᩳ;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
