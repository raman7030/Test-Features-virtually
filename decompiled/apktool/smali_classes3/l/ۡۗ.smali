.class public final Ll/ۡۗ;
.super Ljava/lang/Object;
.source "X63W"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p4, p0, Ll/ۡۗ;->֫:Ljava/lang/String;

    .line 130
    iput p1, p0, Ll/ۡۗ;->ܳ:I

    .line 131
    iput-boolean p6, p0, Ll/ۡۗ;->ۧ:Z

    .line 132
    iput-object p5, p0, Ll/ۡۗ;->ܿ:Ljava/lang/String;

    .line 133
    iput p2, p0, Ll/ۡۗ;->ᩳ:I

    .line 134
    iput p3, p0, Ll/ۡۗ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۡۗ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 158
    iget v0, p0, Ll/ۡۗ;->ܽ:I

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 146
    iget-boolean v0, p0, Ll/ۡۗ;->ۧ:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 154
    iget v0, p0, Ll/ۡۗ;->ᩳ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 142
    iget v0, p0, Ll/ۡۗ;->ܳ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ۡۗ;->ܿ:Ljava/lang/String;

    return-object v0
.end method
