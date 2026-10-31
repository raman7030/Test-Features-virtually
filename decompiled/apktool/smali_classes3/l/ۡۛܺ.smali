.class public final Ll/ۡۛܺ;
.super Ll/ۤۤܺ;
.source "F542"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ᩸:Ll/ۡۛܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Ll/ۡۛܺ;

    .line 100
    invoke-direct {v0}, Ll/ۤۤܺ;-><init>()V

    .line 30
    sput-object v0, Ll/ۡۛܺ;->᩸:Ll/ۡۛܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 92
    sget-object v0, Ll/ۡۛܺ;->᩸:Ll/ۡۛܺ;

    return-object v0
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 28
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 40
    :cond_0
    invoke-interface {p2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ordering.natural().reverse()"

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫()Ll/ۤۤܺ;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    return-object v0
.end method
