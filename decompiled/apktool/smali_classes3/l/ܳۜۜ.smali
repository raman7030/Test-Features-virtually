.class public final Ll/ܳۜۜ;
.super Ljava/lang/Object;
.source "079R"


# static fields
.field public static final ܽ:Ll/ܳۜۜ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 649
    new-instance v0, Ll/ܳۜۜ;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ܳۜۜ;->ܽ:Ll/ܳۜۜ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 658
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    iput-object p1, p0, Ll/ܳۜۜ;->֫:Ljava/lang/String;

    .line 660
    iput-object p2, p0, Ll/ܳۜۜ;->ۧ:Ljava/lang/String;

    return-void
.end method
