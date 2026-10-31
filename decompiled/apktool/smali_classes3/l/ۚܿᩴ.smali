.class public Ll/ۚܿᩴ;
.super Ljava/lang/Object;
.source "4N1"

# interfaces
.implements Ll/ۨۜᩴ;


# instance fields
.field public ᩸:I

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput p1, p0, Ll/ۚܿᩴ;->᩸:I

    .line 115
    iput-object p2, p0, Ll/ۚܿᩴ;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 619
    invoke-virtual {p0}, Ll/ۚܿᩴ;->֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۚܿᩴ;->᩹:Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 120
    iget v0, p0, Ll/ۚܿᩴ;->᩸:I

    return v0
.end method
