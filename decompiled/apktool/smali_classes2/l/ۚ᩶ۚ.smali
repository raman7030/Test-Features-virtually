.class public final Ll/ۚ᩶ۚ;
.super Ljava/lang/Object;
.source "X598"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/֨᩶ۚ;

.field public final ܽ:Ll/֨᩶ۚ;

.field public ܿ:Ll/ۚ᩶ۚ;

.field public final ᩳ:Ll/֨᩶ۚ;


# direct methods
.method public constructor <init>(Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;ILjava/lang/String;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/ۚ᩶ۚ;->ܳ:Ll/֨᩶ۚ;

    .line 92
    iput-object p2, p0, Ll/ۚ᩶ۚ;->ܽ:Ll/֨᩶ۚ;

    .line 93
    iput-object p3, p0, Ll/ۚ᩶ۚ;->ᩳ:Ll/֨᩶ۚ;

    .line 94
    iput p4, p0, Ll/ۚ᩶ۚ;->֫:I

    .line 95
    iput-object p5, p0, Ll/ۚ᩶ۚ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)V
    .locals 6

    .line 106
    iget-object v3, p1, Ll/ۚ᩶ۚ;->ᩳ:Ll/֨᩶ۚ;

    iget v4, p1, Ll/ۚ᩶ۚ;->֫:I

    iget-object v5, p1, Ll/ۚ᩶ۚ;->ۧ:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Ll/ۚ᩶ۚ;-><init>(Ll/֨᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;ILjava/lang/String;)V

    .line 107
    iget-object p1, p1, Ll/ۚ᩶ۚ;->ܿ:Ll/ۚ᩶ۚ;

    iput-object p1, p0, Ll/ۚ᩶ۚ;->ܿ:Ll/ۚ᩶ۚ;

    return-void
.end method

.method public static ֫(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)Ll/ۚ᩶ۚ;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 120
    :cond_0
    iget-object v0, p0, Ll/ۚ᩶ۚ;->ܳ:Ll/֨᩶ۚ;

    .line 123
    iget-object v1, p0, Ll/ۚ᩶ۚ;->ܿ:Ll/ۚ᩶ۚ;

    invoke-static {v1, p1, p2}, Ll/ۚ᩶ۚ;->֫(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)Ll/ۚ᩶ۚ;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ᩶ۚ;->ܿ:Ll/ۚ᩶ۚ;

    .line 125
    iget v2, v0, Ll/֨᩶ۚ;->֫:I

    .line 126
    iget-object v3, p0, Ll/ۚ᩶ۚ;->ܽ:Ll/֨᩶ۚ;

    iget v4, v3, Ll/֨᩶ۚ;->֫:I

    .line 127
    iget v5, p1, Ll/֨᩶ۚ;->֫:I

    if-nez p2, :cond_1

    const v6, 0x7fffffff

    goto :goto_0

    .line 128
    :cond_1
    iget v6, p2, Ll/֨᩶ۚ;->֫:I

    :goto_0
    if-ge v5, v4, :cond_6

    if-gt v6, v2, :cond_2

    goto :goto_1

    :cond_2
    if-gt v5, v2, :cond_4

    if-lt v6, v4, :cond_3

    return-object v1

    .line 139
    :cond_3
    new-instance p1, Ll/ۚ᩶ۚ;

    invoke-direct {p1, p0, p2, v3}, Ll/ۚ᩶ۚ;-><init>(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)V

    return-object p1

    :cond_4
    if-lt v6, v4, :cond_5

    .line 143
    new-instance p2, Ll/ۚ᩶ۚ;

    invoke-direct {p2, p0, v0, p1}, Ll/ۚ᩶ۚ;-><init>(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)V

    return-object p2

    .line 147
    :cond_5
    new-instance v1, Ll/ۚ᩶ۚ;

    invoke-direct {v1, p0, p2, v3}, Ll/ۚ᩶ۚ;-><init>(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)V

    iput-object v1, p0, Ll/ۚ᩶ۚ;->ܿ:Ll/ۚ᩶ۚ;

    .line 148
    new-instance p2, Ll/ۚ᩶ۚ;

    invoke-direct {p2, p0, v0, p1}, Ll/ۚ᩶ۚ;-><init>(Ll/ۚ᩶ۚ;Ll/֨᩶ۚ;Ll/֨᩶ۚ;)V

    return-object p2

    :cond_6
    :goto_1
    return-object p0
.end method
