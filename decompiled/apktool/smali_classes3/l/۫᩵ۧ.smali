.class public final Ll/۫᩵ۧ;
.super Ljava/lang/Object;
.source "E8SE"


# static fields
.field public static final ܽ:Ll/۬᩵ۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۤ᩵ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 981
    new-instance v0, Ll/۬᩵ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۫᩵ۧ;->ܽ:Ll/۬᩵ۧ;

    return-void
.end method

.method public constructor <init>(Ll/ۤ᩵ۧ;I)V
    .locals 0

    .line 992
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 993
    iput-object p1, p0, Ll/۫᩵ۧ;->ۧ:Ll/ۤ᩵ۧ;

    .line 994
    iput p2, p0, Ll/۫᩵ۧ;->֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫᩵ۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۫᩵ۧ;->֫:I

    return p0
.end method

.method public static synthetic ֫(Ll/۫᩵ۧ;Ll/۫᩵ۧ;)I
    .locals 0

    .line 982
    iget-object p0, p0, Ll/۫᩵ۧ;->ۧ:Ll/ۤ᩵ۧ;

    iget p0, p0, Ll/ۤ᩵ۧ;->ܽ:I

    iget-object p1, p1, Ll/۫᩵ۧ;->ۧ:Ll/ۤ᩵ۧ;

    iget p1, p1, Ll/ۤ᩵ۧ;->ܽ:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫()Ll/۬᩵ۧ;
    .locals 1

    .line 0
    sget-object v0, Ll/۫᩵ۧ;->ܽ:Ll/۬᩵ۧ;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/۫᩵ۧ;)Ll/ۤ᩵ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫᩵ۧ;->ۧ:Ll/ۤ᩵ۧ;

    return-object p0
.end method
