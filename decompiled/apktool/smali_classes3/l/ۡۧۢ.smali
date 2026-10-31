.class public final Ll/ۡۧۢ;
.super Ljava/lang/Object;
.source "0BM3"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/String;

.field public ܽ:I

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    .line 130
    iput-object p2, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 131
    iput p1, p0, Ll/ۡۧۢ;->ܽ:I

    .line 132
    iput p1, p0, Ll/ۡۧۢ;->֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 155
    iget v0, p0, Ll/ۡۧۢ;->֫:I

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 151
    iget v0, p0, Ll/ۡۧۢ;->ܽ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
