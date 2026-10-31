.class public abstract Ll/۟ܽ֫;
.super Ljava/lang/Object;
.source "DB30"


# instance fields
.field public ֫:Ll/ۧᩳ֫;

.field public ۧ:I

.field public final ܽ:Ll/ܿᩳ֫;


# direct methods
.method public constructor <init>(Ll/ܿᩳ֫;)V
    .locals 1

    .line 1373
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1362
    iput v0, p0, Ll/۟ܽ֫;->ۧ:I

    .line 1364
    new-instance v0, Ll/ۛܽ֫;

    invoke-direct {v0}, Ll/ۛܽ֫;-><init>()V

    iput-object v0, p0, Ll/۟ܽ֫;->֫:Ll/ۧᩳ֫;

    .line 1375
    iput-object p1, p0, Ll/۟ܽ֫;->ܽ:Ll/ܿᩳ֫;

    return-void
.end method
