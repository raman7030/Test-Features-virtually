.class public final Ll/ۚ۠ܺ;
.super Ll/ۖܶܺ;
.source "L2ZO"


# static fields
.field public static final serialVersionUID:J

.field public static final ᩸:Ll/ۚ۠ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ll/ۚ۠ܺ;

    .line 36
    invoke-direct {v0}, Ll/ۖܶܺ;-><init>()V

    .line 29
    sput-object v0, Ll/ۚ۠ܺ;->᩸:Ll/ۚ۠ܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 97
    sget-object v0, Ll/ۚ۠ܺ;->᩸:Ll/ۚ۠ܺ;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x79a31aac

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Optional.absent()"

    return-object v0
.end method

.method public final ֫(Ll/᩸ۗܺ;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method
