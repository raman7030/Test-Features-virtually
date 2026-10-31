.class public final Ll/ۗۜۖ;
.super Ljava/lang/Object;
.source "Y4D9"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ll/ܳ᩷ۖ;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1239
    new-array v0, p1, [B

    iput-object v0, p0, Ll/ۗۜۖ;->֫:[B

    .line 1240
    sget v1, Ll/ܳ᩷ۖ;->ۧ:I

    .line 105
    new-instance v1, Ll/ܽ᩷ۖ;

    invoke-direct {v1, v0, p1}, Ll/ܽ᩷ۖ;-><init>([BI)V

    .line 1240
    iput-object v1, p0, Ll/ۗۜۖ;->ۧ:Ll/ܳ᩷ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۛۜۖ;
    .locals 2

    .line 1244
    iget-object v0, p0, Ll/ۗۜۖ;->ۧ:Ll/ܳ᩷ۖ;

    .line 921
    invoke-virtual {v0}, Ll/ܳ᩷ۖ;->֫()I

    move-result v0

    if-nez v0, :cond_0

    .line 1249
    new-instance v0, Ll/۫ۜۖ;

    iget-object v1, p0, Ll/ۗۜۖ;->֫:[B

    invoke-direct {v0, v1}, Ll/۫ۜۖ;-><init>([B)V

    return-object v0

    .line 922
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Ll/ܳ᩷ۖ;
    .locals 1

    .line 1253
    iget-object v0, p0, Ll/ۗۜۖ;->ۧ:Ll/ܳ᩷ۖ;

    return-object v0
.end method
