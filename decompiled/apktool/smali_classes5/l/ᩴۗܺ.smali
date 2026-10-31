.class public final Ll/ᩴۗܺ;
.super Ll/᩵ۗܺ;
.source "Z3GV"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ᩸:Ll/ᩴۗܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Ll/ᩴۗܺ;

    .line 255
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    sput-object v0, Ll/ᩴۗܺ;->᩸:Ll/ᩴۗܺ;

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 105
    sget-object v0, Ll/ᩴۗܺ;->᩸:Ll/ᩴۗܺ;

    return-object v0
.end method

.method public static synthetic ۧ()Ll/ᩴۗܺ;
    .locals 1

    .line 64
    sget-object v0, Ll/ᩴۗܺ;->᩸:Ll/ᩴۗܺ;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DiscreteDomain.integers()"

    return-object v0
.end method
