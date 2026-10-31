.class public final Ll/ۙۡܿ;
.super Ljava/lang/Object;
.source "R704"


# instance fields
.field public final ֫:Ll/ۗۡܿ;

.field public final ۜ:Ljava/lang/Object;

.field public final ۧ:Ll/᩺ۡܿ;

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;JIILl/᩺ۡܿ;IILl/ۗۡܿ;)V
    .locals 0

    .line 1094
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1095
    iput-object p1, p0, Ll/ۙۡܿ;->ۜ:Ljava/lang/Object;

    .line 1096
    iput-wide p2, p0, Ll/ۙۡܿ;->ᩳ:J

    .line 1097
    iput p4, p0, Ll/ۙۡܿ;->ܽ:I

    .line 1098
    iput p5, p0, Ll/ۙۡܿ;->ܿ:I

    .line 1099
    iput-object p6, p0, Ll/ۙۡܿ;->ۧ:Ll/᩺ۡܿ;

    .line 1100
    iput p7, p0, Ll/ۙۡܿ;->᩻:I

    .line 1101
    iput p8, p0, Ll/ۙۡܿ;->ܳ:I

    .line 1102
    iput-object p9, p0, Ll/ۙۡܿ;->֫:Ll/ۗۡܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۡܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙۡܿ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۙۡܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۙۡܿ;->ᩳ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۙۡܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۙۡܿ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۙۡܿ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙۡܿ;->ۜ:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۗۡܿ;
    .locals 1

    .line 1138
    iget-object v0, p0, Ll/ۙۡܿ;->֫:Ll/ۗۡܿ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 1113
    iget v0, p0, Ll/ۙۡܿ;->ܽ:I

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 1123
    iget-object v0, p0, Ll/ۙۡܿ;->ۧ:Ll/᩺ۡܿ;

    invoke-static {v0}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1118
    iget v0, p0, Ll/ۙۡܿ;->ܿ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 1128
    iget v0, p0, Ll/ۙۡܿ;->᩻:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 1133
    iget v0, p0, Ll/ۙۡܿ;->ܳ:I

    return v0
.end method
