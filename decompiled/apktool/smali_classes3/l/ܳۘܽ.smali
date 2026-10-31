.class public final Ll/ܳۘܽ;
.super Ljava/lang/Object;
.source "M1FH"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p2, p0, Ll/ܳۘܽ;->ܿ:Ljava/lang/String;

    .line 154
    iput-object p3, p0, Ll/ܳۘܽ;->ܽ:Ljava/lang/String;

    .line 155
    iput-object p4, p0, Ll/ܳۘܽ;->֫:Ljava/util/ArrayList;

    .line 156
    iput p1, p0, Ll/ܳۘܽ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ܳۘܽ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 198
    iput-object p1, p0, Ll/ܳۘܽ;->ᩳ:Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 172
    iget v0, p0, Ll/ܳۘܽ;->ۧ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/ܳۘܽ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ܳۘܽ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܳۘܽ;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method
