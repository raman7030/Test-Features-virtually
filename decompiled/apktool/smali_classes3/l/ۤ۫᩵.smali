.class public final Ll/ۤ۫᩵;
.super Ljava/lang/Object;
.source "3ANU"


# static fields
.field public static final ֫:Ll/ܶۛ᩵;

.field public static final ۧ:Ll/ܶۛ᩵;

.field public static final ܽ:Ll/ܶۛ᩵;

.field public static final ᩳ:Ll/ܶۛ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1012
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "EMPTY"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۤ۫᩵;->֫:Ll/ܶۛ᩵;

    .line 1016
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "OFFER_SUCCESS"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۤ۫᩵;->ܽ:Ll/ܶۛ᩵;

    .line 1020
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "OFFER_FAILED"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۤ۫᩵;->ۧ:Ll/ܶۛ᩵;

    .line 1024
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "POLL_FAILED"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۤ۫᩵;->ᩳ:Ll/ܶۛ᩵;

    return-void
.end method
