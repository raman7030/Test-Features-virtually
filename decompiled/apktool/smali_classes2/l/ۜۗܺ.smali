.class public abstract Ll/ۜۗܺ;
.super Ljava/lang/Object;
.source "0644"


# static fields
.field public static final ֫:Ll/ۜۗܺ;

.field public static final ۧ:Ll/ۜۗܺ;

.field public static final ܽ:Ll/ۜۗܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 97
    new-instance v0, Ll/ܳۗܺ;

    .line 90
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 97
    sput-object v0, Ll/ۜۗܺ;->֫:Ll/ۜۗܺ;

    .line 151
    new-instance v0, Ll/᩻ۗܺ;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/᩻ۗܺ;-><init>(I)V

    sput-object v0, Ll/ۜۗܺ;->ܽ:Ll/ۜۗܺ;

    .line 153
    new-instance v0, Ll/᩻ۗܺ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/᩻ۗܺ;-><init>(I)V

    sput-object v0, Ll/ۜۗܺ;->ۧ:Ll/ۜۗܺ;

    return-void
.end method

.method public static synthetic ۧ()Ll/ۜۗܺ;
    .locals 1

    .line 89
    sget-object v0, Ll/ۜۗܺ;->ܽ:Ll/ۜۗܺ;

    return-object v0
.end method

.method public static synthetic ܽ()Ll/ۜۗܺ;
    .locals 1

    .line 89
    sget-object v0, Ll/ۜۗܺ;->ۧ:Ll/ۜۗܺ;

    return-object v0
.end method

.method public static ܿ()Ll/ۜۗܺ;
    .locals 1

    .line 94
    sget-object v0, Ll/ۜۗܺ;->֫:Ll/ۜۗܺ;

    return-object v0
.end method

.method public static synthetic ᩳ()Ll/ۜۗܺ;
    .locals 1

    .line 89
    sget-object v0, Ll/ۜۗܺ;->֫:Ll/ۜۗܺ;

    return-object v0
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(II)Ll/ۜۗܺ;
.end method

.method public abstract ֫(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ll/ۜۗܺ;
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;
.end method

.method public abstract ֫(ZZ)Ll/ۜۗܺ;
.end method

.method public abstract ۧ(ZZ)Ll/ۜۗܺ;
.end method
