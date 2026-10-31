.class public final Ll/ۘۙۡ;
.super Ljava/lang/Object;
.source "41UK"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘۙۡ;->ۧ:Ljava/util/ArrayList;

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘۙۡ;->֫:Ljava/util/ArrayList;

    return-void
.end method
