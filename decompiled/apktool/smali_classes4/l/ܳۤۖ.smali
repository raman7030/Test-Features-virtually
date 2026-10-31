.class public final Ll/ܳۤۖ;
.super Ljava/lang/Object;
.source "09I3"

# interfaces
.implements Ll/֡ۤۖ;
.implements Ll/ۡۛۖ;


# static fields
.field public static final ۬:Ll/᩺۫ۖ;


# instance fields
.field public final ۗ:Ll/᩺۫ۖ;

.field public final ۙ:Ll/᩺۫ۖ;

.field public ᩶:J

.field public final ᩸:Ll/᩺۫ۖ;

.field public final ᩹:Ll/᩺۫ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 24
    new-instance v0, Ll/᩺۫ۖ;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩺۫ۖ;-><init>(J)V

    sput-object v0, Ll/ܳۤۖ;->۬:Ll/᩺۫ۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩺۫ۖ;Ll/᩺۫ۖ;Ll/᩺۫ۖ;Ll/᩺۫ۖ;J)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ܳۤۖ;->᩹:Ll/᩺۫ۖ;

    .line 39
    iput-object p2, p0, Ll/ܳۤۖ;->ۙ:Ll/᩺۫ۖ;

    .line 40
    iput-object p3, p0, Ll/ܳۤۖ;->ۗ:Ll/᩺۫ۖ;

    .line 41
    iput-object p4, p0, Ll/ܳۤۖ;->᩸:Ll/᩺۫ۖ;

    .line 42
    iput-wide p5, p0, Ll/ܳۤۖ;->᩶:J

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩺۫ۖ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܳۤۖ;->᩸:Ll/᩺۫ۖ;

    return-object v0
.end method

.method public final ۧ()Ll/᩺۫ۖ;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳۤۖ;->᩹:Ll/᩺۫ۖ;

    return-object v0
.end method

.method public final ܽ()J
    .locals 2

    .line 62
    iget-wide v0, p0, Ll/ܳۤۖ;->᩶:J

    return-wide v0
.end method

.method public final ܿ()Ll/᩺۫ۖ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ܳۤۖ;->ۗ:Ll/᩺۫ۖ;

    return-object v0
.end method

.method public final ᩳ()Ll/᩺۫ۖ;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ܳۤۖ;->ۙ:Ll/᩺۫ۖ;

    return-object v0
.end method
