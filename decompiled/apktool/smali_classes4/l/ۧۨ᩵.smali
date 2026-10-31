.class public final Ll/ۧۨ᩵;
.super Ll/ܿۨ᩵;
.source "54FB"


# static fields
.field public static final ۙ:Ll/ۧۨ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 2
    new-instance v0, Ll/ۧۨ᩵;

    .line 14
    sget v1, Ll/ۢۨ᩵;->ۧ:I

    sget v2, Ll/ۢۨ᩵;->ᩳ:I

    .line 15
    sget-wide v3, Ll/ۢۨ᩵;->ܽ:J

    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܿۨ᩵;-><init>(IIJ)V

    .line 0
    sput-object v0, Ll/ۧۨ᩵;->ۙ:Ll/ۧۨ᩵;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 24
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
