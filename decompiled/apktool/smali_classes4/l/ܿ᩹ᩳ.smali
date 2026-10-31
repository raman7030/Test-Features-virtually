.class public final Ll/ܿ᩹ᩳ;
.super Ljava/lang/Object;
.source "I6UD"


# instance fields
.field public final ֫:I

.field public final ۧ:J

.field public ܳ:I

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹ᩳ;->ᩳ:Ljava/lang/Object;

    .line 164
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹ᩳ;->ܽ:Ljava/util/HashMap;

    .line 165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ᩹ᩳ;->ܿ:Ljava/util/HashMap;

    const v0, 0xf4240

    .line 171
    iput v0, p0, Ll/ܿ᩹ᩳ;->֫:I

    .line 172
    iput-wide p1, p0, Ll/ܿ᩹ᩳ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 176
    iget v0, p0, Ll/ܿ᩹ᩳ;->ܳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܿ᩹ᩳ;->ܳ:I

    iget v1, p0, Ll/ܿ᩹ᩳ;->֫:I

    if-gt v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/ܰ۬ᩳ;

    const-string v1, "Recovery graph node limit exceeded"

    .line 8
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 176
    throw v0
.end method
