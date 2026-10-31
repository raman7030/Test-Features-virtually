.class public final Ll/ܳۧ;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ۙ:Ll/ۛ᩺ۧ;

.field public final ᩶:Ljava/lang/Object;

.field public ᩸:Ll/ۖ֫;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2110
    new-instance v0, Ll/ܿۧ;

    .line 2111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2110
    sput-object v0, Ll/ܳۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ll/ۖ֫;)V
    .locals 1

    .line 1937
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1921
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܳۧ;->᩶:Ljava/lang/Object;

    .line 1938
    iput-object p1, p0, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    .line 1939
    iput-object p2, p0, Ll/ܳۧ;->᩸:Ll/ۖ֫;

    const/4 p1, 0x0

    .line 1940
    iput-object p1, p0, Ll/ܳۧ;->ۙ:Ll/ۛ᩺ۧ;

    return-void
.end method

.method public static ֫(Landroid/media/session/MediaSession$Token;Ll/ۖ֫;)Ll/ܳۧ;
    .locals 1

    if-eqz p0, :cond_0

    .line 1977
    new-instance v0, Ll/ܳۧ;

    .line 1934
    invoke-direct {v0, p0, p1}, Ll/ܳۧ;-><init>(Ljava/lang/Object;Ll/ۖ֫;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 2009
    :cond_0
    instance-of v1, p1, Ll/ܳۧ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2013
    :cond_1
    check-cast p1, Ll/ܳۧ;

    iget-object p1, p1, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    .line 2014
    iget-object v1, p0, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    if-nez v1, :cond_3

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2

    :cond_3
    if-nez p1, :cond_4

    return v2

    .line 2020
    :cond_4
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1998
    iget-object v0, p0, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2001
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1990
    iget-object v0, p0, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public final ֫()Ll/ۖ֫;
    .locals 2

    .line 2040
    iget-object v0, p0, Ll/ܳۧ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 2041
    :try_start_0
    iget-object v1, p0, Ll/ܳۧ;->᩸:Ll/ۖ֫;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 2042
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۖ֫;)V
    .locals 1

    .line 2049
    iget-object v0, p0, Ll/ܳۧ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 2050
    :try_start_0
    iput-object p1, p0, Ll/ܳۧ;->᩸:Ll/ۖ֫;

    .line 2051
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۛ᩺ۧ;)V
    .locals 1

    .line 2067
    iget-object v0, p0, Ll/ܳۧ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 2068
    :try_start_0
    iput-object p1, p0, Ll/ܳۧ;->ۙ:Ll/ۛ᩺ۧ;

    .line 2069
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()Ll/ۛ᩺ۧ;
    .locals 2

    .line 2058
    iget-object v0, p0, Ll/ܳۧ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 2059
    :try_start_0
    iget-object v1, p0, Ll/ܳۧ;->ۙ:Ll/ۛ᩺ۧ;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 2060
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 1

    .line 2033
    iget-object v0, p0, Ll/ܳۧ;->᩹:Ljava/lang/Object;

    return-object v0
.end method
