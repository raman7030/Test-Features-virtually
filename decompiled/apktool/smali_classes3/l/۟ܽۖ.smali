.class public final Ll/۟ܽۖ;
.super Ll/᩺ܽۖ;
.source "6B0E"


# static fields
.field public static final ֫:Ll/۟ܽۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ll/۟ܽۖ;

    invoke-direct {v0}, Ll/۟ܽۖ;-><init>()V

    sput-object v0, Ll/۟ܽۖ;->֫:Ll/۟ܽۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 40
    invoke-direct {p0}, Ll/᩺ܽۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 63
    instance-of p1, p1, Ll/۟ܽۖ;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 57
    const-class v0, Ll/۟ܽۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
