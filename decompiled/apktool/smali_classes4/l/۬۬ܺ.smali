.class public final Ll/۬۬ܺ;
.super Ll/᩷ۙܺ;
.source "W3U9"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ۙ:Ll/۬۬ܺ;

.field public static final ᩶:Ll/۬۬ܺ;

.field public static final synthetic ᩹:I


# instance fields
.field public final transient ᩸:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 61
    new-instance v0, Ll/۬۬ܺ;

    .line 62
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 85
    sget-object v1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 62
    invoke-direct {v0, v1}, Ll/۬۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    sput-object v0, Ll/۬۬ܺ;->ۙ:Ll/۬۬ܺ;

    .line 64
    new-instance v0, Ll/۬۬ܺ;

    .line 65
    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-static {v1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۬۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    sput-object v0, Ll/۬۬ܺ;->᩶:Ll/۬۬ܺ;

    return-void
.end method

.method public constructor <init>(Ll/ܳ۬ܺ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Ll/۬۬ܺ;->᩸:Ll/ܳ۬ܺ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 887
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۧ()Ll/۬۬ܺ;
    .locals 1

    .line 108
    sget-object v0, Ll/۬۬ܺ;->᩶:Ll/۬۬ܺ;

    return-object v0
.end method

.method public static ܽ()Ll/۬۬ܺ;
    .locals 1

    .line 87
    sget-object v0, Ll/۬۬ܺ;->ۙ:Ll/۬۬ܺ;

    return-object v0
.end method


# virtual methods
.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 882
    new-instance v0, Ll/ۗ۬ܺ;

    iget-object v1, p0, Ll/۬۬ܺ;->᩸:Ll/ܳ۬ܺ;

    invoke-direct {v0, v1}, Ll/ۗ۬ܺ;-><init>(Ll/ܳ۬ܺ;)V

    return-object v0
.end method

.method public final ֫()Ljava/util/Set;
    .locals 3

    .line 309
    iget-object v0, p0, Ll/۬۬ܺ;->᩸:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 310
    sget v0, Ll/ۛ۬ܺ;->᩶:I

    .line 79
    sget-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object v0

    .line 312
    :cond_0
    new-instance v1, Ll/ۢۛܺ;

    sget v2, Ll/ܰۤܺ;->᩶:I

    .line 129
    sget-object v2, Ll/᩺ۤܺ;->᩸:Ll/ۤۤܺ;

    .line 312
    invoke-direct {v1, v0, v2}, Ll/ۢۛܺ;-><init>(Ll/ܳ۬ܺ;Ljava/util/Comparator;)V

    return-object v1
.end method

.method public final ֫(Ljava/lang/Integer;)Ll/ܰۤܺ;
    .locals 6

    .line 201
    new-instance v1, Ll/ۚ۬ܺ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 310
    new-instance v2, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v2, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 172
    sget-object v3, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 206
    sget-object v4, Ll/֫ۨܺ;->᩹:Ll/֫ۨܺ;

    sget-object v5, Ll/ۤۛܺ;->ۙ:Ll/ۤۛܺ;

    .line 202
    iget-object v0, p0, Ll/۬۬ܺ;->᩸:Ll/ܳ۬ܺ;

    invoke-static/range {v0 .. v5}, Ll/ۧۨܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;Ljava/lang/Comparable;Ljava/util/Comparator;Ll/֫ۨܺ;Ll/ۤۛܺ;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 210
    iget-object v1, p0, Ll/۬۬ܺ;->᩸:Ll/ܳ۬ܺ;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۤܺ;

    .line 211
    invoke-virtual {v0, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
