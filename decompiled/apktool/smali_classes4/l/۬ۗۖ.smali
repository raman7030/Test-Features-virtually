.class public final Ll/۬ۗۖ;
.super Ljava/lang/Object;
.source "U5KR"

# interfaces
.implements Ll/ܰۗۖ;


# instance fields
.field public ֫:I

.field public ۧ:Ll/ᩳ᩶ۖ;

.field public ܳ:Z

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Ljava/util/HashMap;

.field public ᩳ:Ll/۬ۗۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 585
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ۗۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 612
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۬ۗۖ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()C
    .locals 1

    .line 607
    iget-boolean v0, p0, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x78

    return v0

    :cond_0
    const/16 v0, 0x3f

    return v0
.end method
