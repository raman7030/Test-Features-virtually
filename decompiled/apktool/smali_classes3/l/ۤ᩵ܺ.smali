.class public final Ll/ۤ᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 320
    iput-object v0, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 321
    iput v0, p0, Ll/ۤ᩵ܺ;->ۧ:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۤ᩵ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 367
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    iget-object v1, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ᩵ܺ;

    .line 369
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 v1, 0x5b

    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۤ᩵ܺ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 355
    iget v0, p0, Ll/ۤ᩵ܺ;->ۧ:I

    add-int/lit16 v0, v0, 0x3e8

    iput v0, p0, Ll/ۤ᩵ܺ;->ۧ:I

    return-void
.end method
