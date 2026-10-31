.class public final Ll/᩺᩷ۜ;
.super Ljava/lang/Object;
.source "A797"


# static fields
.field public static final ܳ:Ll/᩺᩷ۜ;

.field public static final ܿ:Ll/᩺᩷ۜ;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:[Ljava/lang/String;

.field public final ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1226
    new-instance v0, Ll/᩺᩷ۜ;

    invoke-static {}, Ll/۟᩷ۜ;->֫()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Ll/᩺᩷ۜ;-><init>([Ljava/lang/String;Ljava/lang/String;ZZ)V

    sput-object v0, Ll/᩺᩷ۜ;->ܿ:Ll/᩺᩷ۜ;

    .line 1227
    new-instance v0, Ll/᩺᩷ۜ;

    invoke-static {}, Ll/۟᩷ۜ;->֫()[Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Ll/᩺᩷ۜ;-><init>([Ljava/lang/String;Ljava/lang/String;ZZ)V

    sput-object v0, Ll/᩺᩷ۜ;->ܳ:Ll/᩺᩷ۜ;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1237
    iput-object p1, p0, Ll/᩺᩷ۜ;->ܽ:[Ljava/lang/String;

    .line 1238
    iput-object p2, p0, Ll/᩺᩷ۜ;->ۧ:Ljava/lang/String;

    .line 1239
    iput-boolean p3, p0, Ll/᩺᩷ۜ;->֫:Z

    .line 1240
    iput-boolean p4, p0, Ll/᩺᩷ۜ;->ᩳ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;ZZ)Ll/᩺᩷ۜ;
    .locals 2

    .line 1245
    new-instance v0, Ll/᩺᩷ۜ;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 p1, 0x0

    invoke-direct {v0, v1, p0, p2, p1}, Ll/᩺᩷ۜ;-><init>([Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v0
.end method
