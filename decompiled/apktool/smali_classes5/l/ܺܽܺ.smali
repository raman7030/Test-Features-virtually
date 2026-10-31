.class public final Ll/ܺܽܺ;
.super Ll/᩻ܽܺ;
.source "QB9Q"


# instance fields
.field public final ۧ:Ll/ۧᩴܺ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۧᩴܺ;II)V
    .locals 0

    add-int/2addr p4, p3

    .line 66
    invoke-virtual {p2, p3, p4}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object p2

    .line 45
    invoke-direct {p0, p1}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 51
    iput-object p2, p0, Ll/ܺܽܺ;->ۧ:Ll/ۧᩴܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܺܽܺ;->ۧ:Ll/ۧᩴܺ;

    invoke-virtual {v0}, Ll/ۧᩴܺ;->֫()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    return v0
.end method
