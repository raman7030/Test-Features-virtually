.class public final Ll/ۗۧܺ;
.super Ll/᩻ܽܺ;
.source "ZB9M"


# instance fields
.field public final ۧ:Ll/᩶ܺܺ;

.field public final ܽ:Ll/۫ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V
    .locals 1

    const-string v0, "EnclosingMethod"

    .line 50
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 56
    iput-object p1, p0, Ll/ۗۧܺ;->ܽ:Ll/۫ܺܺ;

    .line 57
    iput-object p2, p0, Ll/ۗۧܺ;->ۧ:Ll/᩶ܺܺ;

    return-void

    .line 53
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final ۧ()Ll/۫ܺܺ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۗۧܺ;->ܽ:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ܽ()Ll/᩶ܺܺ;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۗۧܺ;->ۧ:Ll/᩶ܺܺ;

    return-object v0
.end method
