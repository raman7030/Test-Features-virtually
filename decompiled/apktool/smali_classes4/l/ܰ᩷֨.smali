.class public final Ll/ܰ᩷֨;
.super Ll/ۛۢ֨;
.source "P5QW"


# instance fields
.field public final synthetic ᩹:Ll/֫ۢ֨;


# direct methods
.method public constructor <init>(Ll/֫ۢ֨;Ll/֫ۢ֨;)V
    .locals 0

    .line 359
    iput-object p1, p0, Ll/ܰ᩷֨;->᩹:Ll/֫ۢ֨;

    invoke-direct {p0, p2}, Ll/ۛۢ֨;-><init>(Ll/֫ۢ֨;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 362
    iget-object v0, p0, Ll/ܰ᩷֨;->᩹:Ll/֫ۢ֨;

    iget-object v1, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v1}, Lpl/droidsonroids/gif/GifInfoHandle;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 363
    invoke-virtual {v0}, Ll/֫ۢ֨;->start()V

    :cond_0
    return-void
.end method
