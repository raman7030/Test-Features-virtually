.class public final Ll/֡ۖܺ;
.super Ljava/lang/Object;
.source "HBGE"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ll/ۚۖܺ;

.field public ܽ:Ljava/util/ArrayList;

.field public ܿ:Z

.field public ᩳ:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(IILl/ۚۖܺ;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0, p2}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/֡ۖܺ;->ᩳ:Ljava/util/BitSet;

    .line 87
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    .line 88
    iput-object p3, p0, Ll/֡ۖܺ;->ۧ:Ll/ۚۖܺ;

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֡ۖܺ;->֫:Ljava/util/ArrayList;

    .line 90
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/֡ۖܺ;->ܽ:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 91
    iput-boolean p1, p0, Ll/֡ۖܺ;->ܿ:Z

    return-void
.end method
