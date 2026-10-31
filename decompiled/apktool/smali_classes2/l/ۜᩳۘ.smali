.class public final Ll/ۜᩳۘ;
.super Ljava/lang/Object;
.source "H9F9"


# static fields
.field public static final ᩳ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ll/۫ۛۖ;

.field public ܽ:Ll/ܰܽۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/ۜᩳۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۜᩳۘ;->ᩳ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ܰܽۘ;Ll/۫ۛۖ;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/ۜᩳۘ;->ܽ:Ll/ܰܽۘ;

    .line 48
    iput-object p2, p0, Ll/ۜᩳۘ;->ۧ:Ll/۫ۛۖ;

    .line 49
    iput-object p3, p0, Ll/ۜᩳۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(JI[B)Ll/ۜ۟ۖ;
    .locals 2

    .line 123
    new-instance v0, Ll/᩷ܽۘ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/᩷ܽۘ;-><init>(JI[B)V

    .line 135
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 136
    :goto_0
    invoke-virtual {v0}, Ll/᩷ܽۘ;->ܳ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 138
    invoke-virtual {v0}, Ll/ۢܽۘ;->ᩳ()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    sget-object p3, Ll/ۜᩳۘ;->ᩳ:Ll/֫᩻֨;

    const-string p4, "Sending async write request to {} from offset {}"

    iget-object v1, p0, Ll/ۜᩳۘ;->֫:Ljava/lang/String;

    invoke-interface {p3, p4, v1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    iget-object p2, p0, Ll/ۜᩳۘ;->ܽ:Ll/ܰܽۘ;

    iget-object p3, p0, Ll/ۜᩳۘ;->ۧ:Ll/۫ۛۖ;

    invoke-virtual {p2, p3, v0}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;Ll/᩷ܽۘ;)Ll/ۧ۟ۖ;

    move-result-object p2

    .line 140
    invoke-virtual {v0}, Ll/ۢܽۘ;->ܽ()I

    move-result p3

    int-to-long p3, p3

    .line 141
    new-instance v1, Ll/ܳᩳۘ;

    invoke-direct {v1, p3, p4}, Ll/ܳᩳۘ;-><init>(J)V

    .line 56
    new-instance p3, Ll/ۜ۟ۖ;

    invoke-direct {p3, p2, v1}, Ll/ۜ۟ۖ;-><init>(Ll/۟ܰۖ;Ll/ܰܰۖ;)V

    .line 141
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_0
    new-instance p2, Ll/᩻۟ۖ;

    invoke-direct {p2, p1}, Ll/᩻۟ۖ;-><init>(Ljava/util/ArrayList;)V

    .line 156
    new-instance p1, Ll/᩻ᩳۘ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance p3, Ll/ۜ۟ۖ;

    invoke-direct {p3, p2, p1}, Ll/ۜ۟ۖ;-><init>(Ll/۟ܰۖ;Ll/ܰܰۖ;)V

    return-object p3
.end method
