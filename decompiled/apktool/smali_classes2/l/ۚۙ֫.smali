.class public final Ll/ۚۙ֫;
.super Ljava/lang/Object;
.source "V8T2"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:J

.field public final ܽ:Ll/֨ܽۧ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(IJLl/֨ܽۧ;Ljava/util/ArrayList;)V
    .locals 0

    .line 3986
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3987
    iput-object p5, p0, Ll/ۚۙ֫;->֫:Ljava/util/ArrayList;

    .line 3988
    iput-object p4, p0, Ll/ۚۙ֫;->ܽ:Ll/֨ܽۧ;

    .line 3989
    iput p1, p0, Ll/ۚۙ֫;->ᩳ:I

    .line 3990
    iput-wide p2, p0, Ll/ۚۙ֫;->ۧ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۙ֫;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۙ֫;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚۙ֫;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۚۙ֫;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۚۙ֫;)Ll/֨ܽۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۙ֫;->ܽ:Ll/֨ܽۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۚۙ֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۙ֫;->ᩳ:I

    return p0
.end method
