.class public final Ll/ۚܳܿ;
.super Ljava/lang/Object;
.source "V7KC"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Ll/ۚܳܿ;->ۧ:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Ll/ۚܳܿ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ۚܳܿ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Ll/ۚܳܿ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Ll/ۚܳܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
