.class public final Ll/۟ۨ᩻;
.super Ljava/lang/Object;
.source "U78T"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟ۨ᩻;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰۨ᩻;)V
    .locals 2

    .line 23
    iget-object v0, p0, Ll/۟ۨ᩻;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    iget-boolean v0, p1, Ll/ܰۨ᩻;->֫:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Ll/۟ۨ᩻;->֫:Z

    .line 29
    iget v0, p0, Ll/۟ۨ᩻;->ᩳ:I

    iget v1, p1, Ll/ܰۨ᩻;->ᩳ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/۟ۨ᩻;->ᩳ:I

    .line 34
    iget v0, p0, Ll/۟ۨ᩻;->ۧ:I

    iget p1, p1, Ll/ܰۨ᩻;->ۧ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۟ۨ᩻;->ۧ:I

    return-void
.end method
