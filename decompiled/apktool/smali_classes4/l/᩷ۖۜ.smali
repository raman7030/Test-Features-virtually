.class public final Ll/᩷ۖۜ;
.super Ljava/lang/Object;
.source "D6X3"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Z)V
    .locals 0

    .line 2014
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2015
    iput-boolean p4, p0, Ll/᩷ۖۜ;->֫:Z

    .line 2016
    iput-wide p1, p0, Ll/᩷ۖۜ;->ۧ:J

    .line 2017
    iput-object p3, p0, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫()Ll/᩷ۖۜ;
    .locals 5

    .line 2021
    new-instance v0, Ll/᩷ۖۜ;

    const-wide/16 v1, 0x0

    const-string v3, "missing"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ll/᩷ۖۜ;-><init>(JLjava/lang/String;Z)V

    return-object v0
.end method

.method public static ֫(JLjava/lang/String;)Ll/᩷ۖۜ;
    .locals 2

    .line 2025
    new-instance v0, Ll/᩷ۖۜ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Ll/᩷ۖۜ;-><init>(JLjava/lang/String;Z)V

    return-object v0
.end method
